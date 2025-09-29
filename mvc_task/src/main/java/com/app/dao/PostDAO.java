package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
   
   public SqlSession sqlSession;
   
   public PostDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
// 1. 게시글 작성(추가) C
   public void insert(PostVO postVO) {
	   sqlSession.insert("post.insert", postVO);
   }
  
   
// 2. 게시글 목록 R
   public List<PostVO> selectAll() {
	   List<PostVO> posts = sqlSession.selectList("post.selectAll");
	   return posts;
   }
   
   
// 3. 게시글 상세보기 R
   public Optional<PostVO> select(Long id) {
	   return Optional.ofNullable(sqlSession.selectOne("post.select", id)); 
   }
   
// 4. 게시글 수정 U
   public void update(PostVO postVO) {
	   sqlSession.update("post.update", postVO);
   }
   
   
// 5. 게시글 삭제 D
   public void delete(Long id) {
	   sqlSession.delete("post.delete", id);
   }
   
   
}

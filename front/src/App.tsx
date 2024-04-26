import React from 'react';
import './App.css';
import { Route } from 'react-router';
import { AUTH_PATH, LOCAL_PATH, QNA_DETAIL_PATH, QNA_PATH, QNA_UPDATE_PATH, QNA_WRITE_PATH, RATIO_PATH, SERVICE_PATH } from './constant';

function App() {
  return (
    <Route>
      <Route path={AUTH_PATH} element={<></>} />
      <Route path={SERVICE_PATH} element={<></>} >
        <Route path={LOCAL_PATH} element={<></>} />
        <Route path={RATIO_PATH} element={<></>} />
        <Route path={QNA_PATH} >
          <Route index element={<></>} />                       //* QNA_PATH에 대해서는 이경로로 보여줌 아래는 각각
          <Route path={QNA_WRITE_PATH} element={<></>} />       //* 패턴만 있는형태?? 를 아래로
          <Route path={QNA_DETAIL_PATH} element={<></>} />
          <Route path={QNA_UPDATE_PATH} element={<></>} />
        </Route>
      </Route>
      <Route path='*' element={<></>} />          //* 정해지지 않은 경로
    </Route>
  );
}

export default App;

// - authentication (로그인, 회원가입)
// - service
//    - local (지역 평균)
//    - ratio (비율 계산)
//    - qna (QnA 리스트)
//     - :receptionNumber (QnA 상세보기)
//     - write (QnA 작성)
//     - update/:receptionNumber (QnA 수정)
import logo from './logo.svg';
import './App.css';
import ImportConponent from './comp';
import Cycle from './sycle';
import {Ccycle} from './cycle';
import Decrease from './decrease';
import Lotto from './Lotto';
import Login from './login';
import LottoLotto from './LottoLotto';
import List from './list';
import LottoLottoLotto from './LottoLottoLotto';

function App() {
  return (
    <div>
      <h1> Start React 200! </h1>
      <p> CSS 적용하기 </p>
      {/* <ImportConponent></ImportConponent> */}
      {/* <Cycle></Cycle> */}
      {/* <Ccycle />  */}
      {/* <Decrease></Decrease> */}
      <Lotto></Lotto>
      <Login />
      <List />
      <LottoLottoLotto />
      <LottoLotto />
    </div>
  );
}

export default App;

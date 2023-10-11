import logo from './logo.svg';
import './App.css';
import ImportConponent from './comp';
import Cycle from './sycle';
import {Ccycle} from './cycle';
import Decrease from './decrease';
import Lotto from './Lotto';

function App() {
  return (
    <div>
      <h1> Start React 200! </h1>
      <p> CSS 적용하기 </p>
      {/* <ImportConponent></ImportConponent> */}
      {/* <Cycle></Cycle> */}
      {/* <Ccycle />  */}
      <Decrease></Decrease>
      <Lotto></Lotto>
    </div>
  );
}

export default App;

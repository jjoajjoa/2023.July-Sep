import {BrowserRouter as Router, Routes, Route, Link} from "react-router-dom";
import Home from './Home';
import Chat from './Chat';
import Video from './Video';
import Product from './Product';
import Query from './Query';
import ProductList from './ProductList';

function VideoHome() {
  return (
    <>
        <p> 비디오 홈 </p>
    </>
  );
}

function VideoList() {
  return (
    <p> 비디오 리스트: </p>
  );
}


function ChatHome() {
  return (
    <>
        <p> 채팅 홈 </p>
    </>
  );
}

function ChatList() {
  return (
    <p> 채팅 리스트: </p>
  );
}


function App() {

  const productData = [
    {id:1, name:'마이쮸', price:'₩ 700'},
    {id:2, name:'새콤달콤', price:'₩ 500'},
    {id:3, name:'아메리카노', price:'₩ 2,000'},
    {id:4, name:'바닐라라때', price:'₩ 5,000'},
  ];

  return (
    <div>
      <Router>

        {/* 라우트 설정 */}
        <Routes>
          <Route path="/" element={<Home />} />
          <>
          <Route path="/chat" element={<Chat />}>
            <Route index element={<ChatHome />} />
            <Route path="list" element={<ChatList />} />
          </Route>
          </><>
          <Route path="/video" element={<Video />}>
            <Route index element={<VideoHome />} />
            <Route path="list" element={<VideoList />} />
          </Route>
          </><>
          <Route path="/product/:id" element= {<Product data={productData} />} />
          <Route path="/query" element={<Query />} />
          </><>
          <Route path="/productlist/:id?" element={<ProductList data={productData} />} />
          </>
        </Routes>

        {/* 링크 설정 */}
        <nav>
          <ul>
            <li><Link to='/'> 홈 </Link></li>
            <li><Link to='/chat'> 채팅 </Link></li>
            <li><Link to='/video'> 비디오 </Link></li>
          </ul>
        </nav>

        {/* 예제01 */}
        <nav>
          <ul>
            {productData.map((product) => (
              <li key={product.id}>
                <Link to={`/vedio/product/${product.id}`}> {product.name} </Link>
              </li>
            ))}
          </ul>
        </nav>

      </Router>
    </div>
  );
}

export default App;
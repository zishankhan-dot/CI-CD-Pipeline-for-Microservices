import { Link , Route, Routes } from "react-router-dom";
import Login from "./Login.tsx";
import Catalog from "./Catalog.tsx";


export default function App() {


return (
  <div className="App">
    <header className="App-header">
      <h1>WebPage For DevOps Microservices</h1>
      <h2>Created By Zishan Hassan Khan </h2>
      <h2>DevOps Engineer</h2>
      <h2>github:<a href="https://github.com/zishankhan-dot/" target="_blank" rel="noopener noreferrer">zishanhassankhan</a></h2>
    </header>
    <main>
        <h1> login and catalog Microservices </h1>
        <Link to="/login"> Login </Link>
        <Link to ="/catalog"> Catalog </Link>




        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/catalog" element={<Catalog/>} />
        </Routes>


    </main>
  </div>
);
}
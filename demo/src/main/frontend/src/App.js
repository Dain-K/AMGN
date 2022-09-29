import "./App.css";
import React, { useEffect, useState } from "react";
import axios from "axios";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Login from "./pages/Login";

function App() {
  const [hello, setHello] = useState("");

  useEffect(() => {
    axios
      .get("/api/hello")
      .then((response) => setHello(response.data))
      .catch((error) => console.log(error));
  }, []);

  return (
    <Router>
      <Routes>
        <Route path="/" exact={true} element={<Home />} />
        <Route path="/Login" element={<Login />} />
      </Routes>
    </Router>
  );
  //   <div>백엔드에서 가져온 데이터입니다 : {hello}</div>;
}

export default App;

// frontend/src/components/Home/Home.jsx
import React, { useEffect, useState } from 'react';

const Home = () => {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch("http://localhost:8080/")
      .then(response => response.text())
      .then(data => setMessage(data));
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "2rem" }}>
      <h1>{message || "Loading..."}</h1>
    </div>
  );
};

export default Home;

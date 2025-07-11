import React from "react";
import ProductsContainer from "./components/customer/Products/index.tsx";
import Navbar from "./components/customer/nav/index.tsx";
const handleLogout = () => {
  console.log("Logged out");
};

const dummyProducts = [
  {
    id: 1,
    image: "https://via.placeholder.com/250",
    name: "Running Shoes",
    description: "Lightweight and comfortable",
    price: 1499,
  },
  {
    id: 2,
    image: "https://via.placeholder.com/250",
    name: "Smart Watch",
    description: "Track your fitness with style",
    price: 2499,
  },
  {
    id: 3,
    image: "https://via.placeholder.com/250",
    name: "Wireless Earbuds",
    description: "High-quality sound and battery life",
    price: 999,
  },
];

const App: React.FC = () => {
  return (
    <>
      <Navbar name="Niyas" onLogout={handleLogout} />
      <ProductsContainer products={dummyProducts} />
    </>
  );
};

export default App;

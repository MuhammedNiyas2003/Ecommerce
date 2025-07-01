import React from "react";
import CartProductCard from "../CartProductCard/index.tsx"; //
import "./style.scss";

const cartItems = [
  {
    image: "https://via.placeholder.com/120",
    name: "Wireless Headphones",
    description: "Noise-cancelling over-ear headphones",
    price: 2999,
    qty: 2,
  },
  {
    image: "https://via.placeholder.com/120",
    name: "Smart Watch",
    description: "Fitness tracker with heart rate monitor",
    price: 1999,
    qty: 1,
  },
];

const CartPage: React.FC = () => {
  const totalPrice = cartItems.reduce(
    (acc, item) => acc + item.price * item.qty,
    0
  );

  return (
    <div className="cart-page">
      <h1 className="cart-title">Your Shopping Cart</h1>
      <div className="cart-content">
        <div className="cart-items">
          {cartItems.map((item, index) => (
            <CartProductCard key={index} {...item} />
          ))}
        </div>
        <div className="cart-summary">
          <h2>Order Summary</h2>
          <p>Total Items: {cartItems.length}</p>
          <p>Total Price: ₹{totalPrice}</p>
          <button className="checkout-btn">Proceed to Checkout</button>
        </div>
      </div>
    </div>
  );
};

export default CartPage;

import React from "react";
import "./style.scss";

interface CartProps {
  image: string;
  name: string;
  description: string;
  price: number;
  qty: number;
}

const CartProductCard: React.FC<CartProps> = ({
  image,
  name,
  description,
  price,
  qty,
}) => {
  return (
    <>
      <div className="cart-product-card">
        <img src={image} alt={name} className="product-image" />
        <div className="product-details">
          <p className="product-name">{name}</p>
          <p className="product-description">{description}</p>
          <p className="product-price">₹{price}</p>
          <p className="product-qty">{qty}</p>
          <p className="reduce-qty">+</p>
          <p className="add-qty">+</p>
        </div>
      </div>
    </>
  );
};

export default CartProductCard;

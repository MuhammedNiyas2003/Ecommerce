import React from "react";
import "./style.scss";

interface ProductProps {
  image: string;
  name: string;
  description: string;
  price: number;
}

const ProductCard: React.FC<ProductProps> = ({
  image,
  name,
  description,
  price,
}) => {
  return (
    <div className="product-card">
      <img src={image} alt={name} className="product-image" />
      <div className="product-details">
        <p className="product-name">{name}</p>
        <p className="product-description">{description}</p>
        <p className="product-price">₹{price}</p>
      </div>
    </div>
  );
};

export default ProductCard;

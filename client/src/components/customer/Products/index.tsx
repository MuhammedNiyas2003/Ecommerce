import React from "react";
import "./style.scss";
import Product from "../ProductCard/index.tsx";

interface ProductData {
  id: number;
  image: string;
  name: string;
  description: string;
  price: number;
}

interface ProductsContainerProps {
  products: ProductData[];
}

const ProductsContainer: React.FC<ProductsContainerProps> = ({ products }) => {
  return (
    <div className="products-container">
      {products.map((product) => (
        <Product
          key={product.id}
          image={product.image}
          name={product.name}
          description={product.description}
          price={product.price}
        />
      ))}
    </div>
  );
};

export default ProductsContainer;

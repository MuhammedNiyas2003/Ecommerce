import React from "react";
import "./style.scss";

interface NavbarProps {
  name: string;
  onLogout: () => void;
  profileImage?: string;
}

const Navbar: React.FC<NavbarProps> = ({ name, onLogout, profileImage }) => {
  return (
    <nav className="navbar">
      <div className="navbar-left">
        <h2 className="navbar-title">E-Commerce</h2>
      </div>

      <div className="navbar-right">
        <div className="user-info">
          {profileImage ? (
            <img src={profileImage} alt="Profile" className="profile-image" />
          ) : (
            <div className="profile-placeholder">{name[0]}</div>
          )}
          <span className="user-name">{name}</span>
        </div>
        <button className="logout-button" onClick={onLogout}>
          Logout
        </button>
      </div>
    </nav>
  );
};

export default Navbar;

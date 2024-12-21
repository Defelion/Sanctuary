import {useState} from "react";
import {Link, NavLink} from "react-router-dom";
import "./NavBar.css"

export function NavBar() {
    const [menuOpen, setMenuOpen] = useState(false)

    return (
        <>
            <nav>
                <Link to="" className="title">Home</Link>
                <div className={menuOpen ? "BurgerMenu open" : "BurgerMenu"} onClick={() => {
                    setMenuOpen(!menuOpen);
                }}>
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                <ul className={menuOpen ? "open" : ""}>
                    <li>
                        <NavLink to="About">About</NavLink>
                    </li>
                    <li>
                        <NavLink to="Contact">Contact</NavLink>
                    </li>
                </ul>
            </nav>
        </>
    )
}
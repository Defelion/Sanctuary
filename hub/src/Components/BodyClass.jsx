import {Component} from "react";
import {Route, Routes} from "react-router-dom";
import {About} from "./Pages/About";
import {Contact} from "./Pages/Contact";
import {Home} from "./Pages/Home";

export class BodyClass extends Component {
    render() {
        return (
            <>
                <Routes>
                    <Route path="" element={<Home />}></Route>
                    <Route path="about" element={<About />}></Route>
                    <Route path="contact" element={<Contact />}></Route>
                </Routes>
            </>
        )
    }
}
import './App.css';
import {HeaderClass} from "./Components/HeaderClass";
import {BodyClass} from "./Components/BodyClass";
import {FooterClass} from "./Components/FooterClass";

function App() {
  return (
    <div className="App">
      <div className="SiteHeader">
        <HeaderClass />
      </div>
      <div className="SiteBody">
        <BodyClass />
      </div>
      <div className="SiteFoote"r>
        <FooterClass />
      </div>
    </div>
  );
}

export default App;

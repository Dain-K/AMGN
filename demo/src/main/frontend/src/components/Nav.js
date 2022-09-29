import { Component } from "react";

export default class Nav extends Component {
  render() {
    return (
      <div>
        <header>
          <nav className="Nav">
            <span className="Nav_title">AMGN</span>
            <div className="Navi">
              <a className="Navs" href="#home">
                메인
              </a>
            </div>
          </nav>
        </header>
      </div>
    );
  }
}

import { Component } from "react";

export default class Header extends Component {
  render() {
    return (
      <div>
        {/* HEADER */}
        <nav class="navigation">
          <ul>
            <li>
              <a href="/">
                <span>Amgn</span>
              </a>
            </li>
            <li>
              <a href="/">
                <span>모든 자격증</span>
              </a>
            </li>
            <li>
              <a href="/">
                <span>추천 자격증</span>
              </a>
            </li>
          </ul>
        </nav>
      </div>
    );
  }
}

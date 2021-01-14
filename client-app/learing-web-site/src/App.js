import React,{Component} from 'react'
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.min.js'
 import  SpringBoot from './component/SpringBoot';
class  App extends Component{
    render() {

        return(

        <div>
   <nav className="navbar navbar-expand-sm navbar-dark bg-dark mb-3">
       <div className="container">
           <a className="navbar-brand" href="#">جاوا تار</a>
           <button className="navbar-toggler" data-toggle="collapse" data-target="#navbarNav">
               <span className="navbar-toggler-icon"></span>
           </button>
           <div className="collapse navbar-collapse" id="navbarNav">
               <ul className="navbar-nav ml-auto">
                   <li className="nav-item">
                       <a className="nav-link" href="#">تماس با ما</a>
                   </li>
                   <li className="nav-item">
                       <a className="nav-link" href="#"> درباره ما</a>
                   </li>
               </ul>
           </div>

       </div>


   </nav>
            <SpringBoot/>


          </div>


    );

    }

}
export default App;

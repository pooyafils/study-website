import React,{Component} from 'react'
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.min.js'
 import  SpringBoot from './component/SpringBoot';
import  Spring from './component/Spring';
import  Javase from './component/Javase';
import  Javaee from './component/Javaee';
import  Springcloud from './component/SpringColud';
import  Mongo from './component/Mongo';


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
            <Spring/>
<Javase/>
<Javaee/>
<Springcloud/>
<Mongo/>
            <footer className="footer  text-white bg-dark">
                <div className="text-center mt-3">&copy; تمامی حقوق محفوظ هست </div>
            </footer>
        </div>


    );

    }

}
export default App;

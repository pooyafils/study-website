import React from "react";
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.min.js'
import logo from '../image/springboot-image.jpg';
import './course-component-style.css'
const springboot=()=>{

    return(

<div>
        <div className="container autosizing h-auto border border-dark    ">
            <div className="card">
                <div className="card-header text-center">دوره اموزشی اسپرینگ بوت</div>
                <img className="card-img-top img mt-2    " src={logo}/>
                <div className="card-body">
                    <h4 className="card-title text-center">عنوان دوره </h4>
                    <p className="card-text text-right ">مطلالب برای توضیحات</p>
                    <a className="btn btn-info btn-block mt-2 " href="http://localhost:7070/download/20">دانلود سرفصل های این دوره </a>
                    <a className="btn btn-success btn-block mt-2 " href="http://localhost:7070/download/see/20">ثبت نام </a>

                </div>
            </div>

        </div>

    <footer className="footer  text-white bg-dark">
        <div className="text-center mt-3">&copy; تمامی حقوق محفوظ هست </div>
    </footer>

</div>

    )

}

export default springboot;



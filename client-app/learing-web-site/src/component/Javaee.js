import React from "react";
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.min.js'
import logo from '../image/javaee.jpg';
import './course-component-style.css'
const springboot=()=>{

    return(

<div>
        <div className="container autosizing h-auto  mt-2    ">
            <div className="card">
                <div className="card-header text-center"> java EE دوره آموزشی</div>
                <img className="card-img-top img mt-2    " src={logo}/>
                <div className="card-body">
                    <h4 className="card-title text-center">عنوان دوره </h4>
                    <p className="card-text text-right ">مطلالب برای توضیحات</p>
                    <a className="btn btn-info btn-block mt-2 " href="http://localhost:7070/download/25">دانلود سرفصل های این دوره </a>
                    <button className="btn btn-primary d-block m-3" data-toggle="collapse"
                            data-target="#collapse-btn-16">ثبت نام این دوره
                    </button>

                    <div className="collapse mb-5" id="collapse-btn-16">
                        <div className="card">
                            <div className="card-body">
                               لطفا با شماره 0912
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>



</div>

    )

}

export default springboot;



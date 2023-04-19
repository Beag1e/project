import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link, useNavigate, useParams } from 'react-router-dom';

export default function EditUser() {

    let navigate = useNavigate();

    const {userid} = useParams();

    const [user, setUser] = useState({
        username: "",
        email: "",
        password: ""
    });

    const { username, email, password} = user;

    const onInputChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value });
    };

    useEffect(() => {
        loadUser();
    }, []);

    const onSubmit = async (e) => {
        e.preventDefault();
        await axios.put(`http://localhost:8080/user/${userid}`,user);
        navigate("/")
    };

    const loadUser = async () => {
        const result = await axios.get(`http://localhost:8080/user/${userid}`);
        setUser(result.data);
    }

  return (
    <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className='text-center m-4'>Edit User</h2>
                <form onSubmit={(e) => onSubmit(e)}>
                    <div className='mb-3'>
                        <label htmlFor='Username' className='form-label'>
                            Username
                        </label>
                        <input type={"text"} className='form-control' placeholder='Enter your Username' name='username' value={username} onChange={(e)=>onInputChange(e)}/>
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='Email' className='form-label'>
                            Email
                        </label>
                        <input type={"text"} className='form-control' placeholder='Enter your Email' name='email' value={email} onChange={(e)=>onInputChange(e)}/>
                    </div>
                    <div className='mb-3'>
                        <label htmlFor='Password' className='form-label'>
                            Password
                        </label>
                        <input type={"text"} className='form-control' placeholder='Enter your Password' name='password' value={password} onChange={(e)=>onInputChange(e)}/>
                    </div>
                    <button type='submit' className='btn btn-outline-primary'>Submit</button>
                    <Link className='btn btn-outline-danger mx-2' to={"/"}>Cancel</Link>
                </form>
            </div>
        </div>
    </div>
  )
}

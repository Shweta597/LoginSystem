import React, { useState } from 'react';
import axios from 'axios';

function RegisterForm() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState('');

    // Handle form submission
    const handleRegister = async (e) => {
        e.preventDefault(); // Prevent page reload
        setMessage("Form submit triggered");
        // Create the payload to send to the backend
        const user = {
            email: email,
            password: password
        };

        try {
            // Send POST request to the backend API
            const response = await axios.post('http://localhost:8080/register', user);

            // On success, show a success message
            setMessage(response.data); // "User registered successfully!"
        } catch (error) {
            setMessage('Error during registration:', error);
            console.error('Error during registration:', error); // 👈 this line
            if (error.response) {
                setMessage(error.response.data);
            } else {
                setMessage('An error occurred while registering');
            }
        }
        
    };

    return (
        <div>
            <h2>Register</h2>
            <form onSubmit={handleRegister}>
                <div>
                    <label htmlFor="email">Email: </label>
                    <input 
                        type="email" 
                        id="email" 
                        value={email} 
                        onChange={(e) => setEmail(e.target.value)} 
                        required 
                    />
                </div>
                <div>
                    <label htmlFor="password">Password: </label>
                    <input 
                        type="password" 
                        id="password" 
                        value={password} 
                        onChange={(e) => setPassword(e.target.value)} 
                        required 
                    />
                </div>
                <div>
                    <button type="submit">Register</button>
                </div>
            </form>

            {message && <p>{message}</p>}
        </div>
    );
}

export default RegisterForm;

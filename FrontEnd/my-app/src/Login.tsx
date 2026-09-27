export default function Login(){






    return(
        <div>
            <div>
                <h1> Login Details </h1>
                 <form className="login-form">
                    <input type="text" placeholder="Enter Username" name="username" required />
                    <input type="password" placeholder="Enter Password" name="password" required />
                    <button type="submit">Login</button>
                 </form>
            </div>
        </div>
    )
}
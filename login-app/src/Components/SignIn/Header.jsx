import {  useNavigate, Link } from 'react-router-dom';
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Button from '@mui/material/Button';

function Header() {

  const navigate = useNavigate()
 
   // 로그아웃 하드 코딩
   function handleSubmitLogout(e) {
    e.preventDefault();
    // 로그아웃 성공하면 로그아웃 페이지로 이동
    // mui 사용하면 필요없어짐
   navigate(`/Logout`) 
   }

   function handleLoginClick() {
    navigate(`/`)
   }
   return (
     <header className="header">
        <AppBar position="static" sx={{ backgroundColor: 'transparent'}} className="headerapp">
       <div className="container">
         <Toolbar>
           <ul className="navbar-nav" style={{ display: 'flex', alignItems: 'center' ,listStyle: 'none'}}>
           
             <li style={{marginRight: '1rem'}} className="nav-item"><Link className="nav-link" to="/Landing/:username">Home</Link></li>
             <li style={{marginRight: '1rem'}} className="nav-item"><Link className="nav-link" to="/MachinePage">기계</Link></li>
             <li style={{marginRight: '1rem'}} className="nav-item"><Link className="nav-link" to="/TemperaturePage">온도</Link></li>
             <li style={{marginRight: '1rem'}} className="nav-item"><Link className="nav-link" to="/Computervision">불량품</Link></li>
             <li style={{marginRight: '1rem'}} className="nav-item"><Link className="nav-link" to="/Administrator">관리자DB</Link></li>
            
           </ul>
           <ul className="navbar-nav" style={{ marginLeft: 'auto', display: 'flex', alignItems: 'center' }}>
             <li style={{marginRight: '1rem'}} className="nav-item"><Button onClick={handleLoginClick}>Login</Button></li>
             <li className="nav-item"><Button onClick={handleSubmitLogout}>Logout</Button></li>
           </ul>
         </Toolbar>
       </div>
     </AppBar>
    </header>
 
 
 
   )
 }
 
 export default Header;
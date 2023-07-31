import { useParams } from 'react-router-dom';
import React from 'react';

function LandingPage() {
 
  const {username} = useParams()

  return (
    <div className="landing">
      <h1>Welcome {username}</h1>
    
    </div>
  )
}

export default LandingPage;
import React from 'react';
import { useNavigate } from 'react-router-dom';
import { Container, Typography, Button, Box } from '@mui/material';

function HomePage() {
    const navigate = useNavigate();

    const handleRegister = () => {
        navigate('/register');
    };

    const handleLogin = () => {
        navigate('/login');
    };

    return (
        <Container maxWidth="sm">
            <Box
                sx={{
                    mt: 10,
                    p: 4,
                    borderRadius: 3,
                    boxShadow: 3,
                    textAlign: 'center',
                    backgroundColor: '#f5f5f5'
                }}
            >
                <Typography variant="h3" gutterBottom>
                    Welcome to Our Application
                </Typography>
                <Box sx={{ mt: 3 }}>
                    <Button
                        variant="contained"
                        color="primary"
                        onClick={handleRegister}
                        sx={{ mr: 2 }}
                    >
                        Register
                    </Button>
                    <Button
                        variant="outlined"
                        color="secondary"
                        onClick={handleLogin}
                    >
                        Login
                    </Button>
                </Box>
            </Box>
        </Container>
    );
}

export default HomePage;

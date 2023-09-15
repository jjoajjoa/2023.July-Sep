import Button from './Button';
import styled from 'styled-components';
import 'bootstrap/dist/css/bootstrap.min.css';
import BootButton from 'react-bootstrap/Button';
import {Container, Row, Col} from 'react-bootstrap';

const StyledButton = styled.button`
  background-color:aqua;
  color:white;
  padding:10px;
  
  &:hover {
    background-color:blue;
  }
`;

function App() {
  return (
    <>
      <p> 
        <h2> [Button.모듈.css] </h2>
        <Button />
      </p>
      <p>
        <h2> ['styled-components'] </h2>
        <StyledButton> StyledButton </StyledButton>
      </p>
      <p>
        <h2> ['react-bootstrap/Button'] </h2>
        <div className='App'>
          <BootButton as="input" type="button" value="Input" />
        </div>
      </p>
      <p>
        <Container>
          <Row>
            <Col>
              <h2> [react-bootstrap 버튼 종류] </h2>
              <BootButton variant='default'> 버튼 </BootButton>
              <BootButton variant='primary'> 버튼 </BootButton>
              <BootButton variant='success'> 버튼 </BootButton>
              <BootButton variant='info'> 버튼 </BootButton>
              <BootButton variant='warning'> 버튼 </BootButton>
              <BootButton variant='danger'> 버튼 </BootButton>
              <BootButton variant='link'> 버튼 </BootButton>
            </Col>
          </Row>
        </Container>
      </p>

    </>
  );
}

export default App;

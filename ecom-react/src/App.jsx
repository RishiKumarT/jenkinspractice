import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ProductManager from './components/ProductManager'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ProductManager/>
    </>
  )
}

export default App

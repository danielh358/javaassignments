const Button = (props) => {
    const color1 = `btn btn-${props.color || 'primary'}`
    const btnsize =  `${' ' + props.size || ''}`
    const color = color1 + btnsize
    return (
      <button
        className={props.className || color}
        {...props}
        
      >
        {props.children || color}
      </button>
    );
  };
  export default Button;
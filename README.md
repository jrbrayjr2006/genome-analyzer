# Genome Analyzer

### Purpose
This project is an example of using oAuth2 security with Spring Boot and ReactJS and provide an application for Single Sign On (SSO) evaluation and testing.

### Scenario
This is a single sign-on and authentication scenario.

## Backend Service
The backend application service is built on Spring Boot.
Secure RESTful services will include authentication, authorization, and encryption components..

## Frontend UI
The frontend application UI is a built on ReactJS.
In the project directory, you can run:

### `npm start`

Runs the app in the development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br>
You will also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.<br>
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.<br>
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.<br>
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (Webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: https://facebook.github.io/create-react-app/docs/code-splitting

### Analyzing the Bundle Size

This section has moved here: https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size

### Making a Progressive Web App

This section has moved here: https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app

### Advanced Configuration

This section has moved here: https://facebook.github.io/create-react-app/docs/advanced-configuration

### Deployment

This section has moved here: https://facebook.github.io/create-react-app/docs/deployment

### `npm run build` fails to minify

This section has moved here: https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify

### Styling

Install the `foundation-sites` style dependency:  
`npm install foundation-sites --save`

Import the style into the `index.js` file: 
`import 'foundation-sites/dist/css/foundation.min.css'`

### Additional Dependencies

Provide defacto documentation for props in a component.

`npm install --save prop-types`

Import the dependency into your component.

`import PropTypes from 'prop-types'`

Use the PropTypes to enforce type checking on the props.

```javascript
MyComponent.PropTypes {
    myprop1: PropTypes.string
    myprop2: PropTypes.func
}
```

## References

- [Spring Security Login Page with React](https://www.baeldung.com/spring-security-login-react)
- [Spring Security OAuth](https://spring.io/projects/spring-security-oauth)
- [React](https://reactjs.org/)
- [Multi-Module Project with Maven](https://www.baeldung.com/maven-multi-module)
- [oAuth 2.0 Getting Started](https://oauth.net/getting-started/)
- [Frontend React Maven Plugin](https://github.com/eirslett/frontend-maven-plugin)
- [REST Resource Naming Guide](https://restfulapi.net/resource-naming/)
- [Creating API Documentation with Restdocs](https://spring.io/guides/gs/testing-restdocs/)
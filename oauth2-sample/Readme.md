# OAuth2 Google Login Example

This is a minimal working example of OAuth2 login with Google, implemented in Java using Spring Boot.

It demonstrates:
- How to integrate **Google OAuth2** login into your Spring Boot web application
- How to handle the authorization flow
- How to retrieve user details such as name, email, and profile picture
- How to secure pages behind authentication
- How to configure logout behavior

## Tech Stack

- Java 17+
- Spring Boot 3
- Spring Security
- Thymeleaf (for simple UI)
- Gradle

## Getting Started

1. **Register an OAuth2 client in Google Cloud Console**  
   Go to [console.cloud.google.com](https://console.cloud.google.com/) and create:
   - OAuth2 credentials
   - Add `http://localhost:8080/login/oauth2/code/google` as an **Authorized redirect URI**

2. **Add your credentials**  
   Put your client ID and secret in `application.yml` or `application.properties`:

   ```yaml
   spring:
     security:
       oauth2:
         client:
           registration:
             google:
               client-id: YOUR_CLIENT_ID
               client-secret: YOUR_CLIENT_SECRET
               scope: profile, email
   ```

3. **Run the application**  
   Use Gradle or your IDE to run the app.  
   Open [http://localhost:8080](http://localhost:8080) and click “Sign in with Google”.

## Features

- Google sign-in via OAuth2
- User info displayed after login
- Logout with session invalidation

## How It Works (Step-by-Step)

1. After running the application, open [http://localhost:8080](http://localhost:8080) and click **"Sign in with Google"**.
2. You will be redirected to Google's login page. Sign in using your Google account.
3. Google will then redirect you back to your app (to `/login/oauth2/code/google`) with a temporary `code` parameter.
4. Spring Security will intercept this and use the `code` to request an access token (and optionally a refresh token) from Google.
5. If everything succeeds, the user will be authenticated and redirected to `/dashboard`, where their profile info is displayed.

Behind the scenes, Spring Boot with `spring-boot-starter-oauth2-client` handles most of the OAuth2 flow for you.

## License

MIT – feel free to use and modify.
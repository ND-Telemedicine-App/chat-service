<h1>ND Telemedicine App - Chat Service</h1>
<h2>RMIT SEPT 2022 Major Project Team 4</h2>

**Members:** 
- Doan Yen Nhi (s3880599)   
- Nguyen Hoang Linh (s3880313)
- Jack Dean (s3722961)
- Matthew Rigo (s3840775)
- Mingkai Wang (s3773115)

**Records**
- Github repository : https://github.com/ND-Telemedicine-App
- jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9

**Code documentation - Release 0.1.0 Major changes & Features - Date: 17/10/22**
- Chat Class
  > Attributes
  > Getters and setters
  > To String method
- Chat Controller:
  > Chat Get API (Chats by Sender Id and Receiver Id, Receiver based on Sender Id, All Chats, Latest Chat)
  > Chat Create API (Create new chat)
- Chat Service:
  > findChatsBySenderIdAndReceiverId method
  > findLatestChat method
  > findAllChats method
  > findReceiverBasedOnSender method
  > createNewChat method
- Chat Repository:
  > findChatsBySenderIdAndReceiverId
  > findChatsBySenderId
- ChatServiceApplicationTests:
  > Created various tests for the APIs

- All classes:
  > Debug and code cleanup
  > Modify and implemented more comments on code
  > CI Build and test
- PrescriptionServiceApplicationTests:
  > Added comments for tests

To run this service locally on MySQL:

1. Run mvn package to build project and create jar files
2. Add a Dockerfile with specific commands to allow for dockerization of service
3. Add heroku.yml file with specific commands to deploy the service on Heroku
4. Create a new app on Heroku, connect the app with this service's Github repo, change the app's stack to container
5. If the code is not on Github, push your code to Heroku's Container Registry using Heroku CLI
6. Set environment variables on Heroku like database link and username
7. Build and deploy service on Heroku. If done correctly, you can open and run the app


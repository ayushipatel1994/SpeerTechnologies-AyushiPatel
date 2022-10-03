**Project - SpeerTechnologies-AyushiPatel**

**Description:**
This is an assessment for Quality Assurance Testing Engineer role in Speer Technologies by candidate - Ayushi Patel
This project includes two main files- 1) For accepting valid integer between 1 to 20 2) For accepting valid wikipedia link and saving valid wiki links into CSV file

**Dependency:**
Progrmming language used - Java

**Executing Program:**

1.) File - Number.java (SpeerTechnologyAssesement -> src -> main -> java -> Speer -> Number.java)
- This file takes a valid integer(n) between 1 to 20 and if you provide a number outside this range - it suggests that "Please enter a valid integer between 1 to 20"

2.) File - Wikipedia.java (SpeerTechnologyAssesement -> src -> main -> java -> Speer -> Wikipedia.java)
- Main purpose of this file is to verify if the provided link is a valid wikipedia link.
- User can give input for the any url to check if it's valid wikipedia link.
- For the URL to be a valid wikipedia link - it needs to start with  "https://en.wikipedia.org/wiki/" - so this project check if the URL contains this particular link in the beginneing for the url to be a valid wiki link.
- If the provided link is valid wiki link - it gets added in the hashset called 'list'
- This only adds the valid links in the set if the link is unique from previous valid links
- All added valid links in the set will increase the Total count of the valid urls once they are added
- This process can be terminated if the user enters "stop"
- Now, if the provided link by the user is not a valid wiki link - it will throw an error
- This project will also create a csv file - Results.csv and store the total unique URLs count and all valid unique URLs

**Note:**
  - Before checking the CSV file - it needs to be refreshed after running the programme each time
  - This programme is just specified for english language:
      But this can further extends for various languages (ex. fr, zh, gr etc.)
  - For the verifying the valid wiki link - We are checking if the link is valid or not. Because even with the random texts after wiki prefix, ex. "https://en.wikipedia.org/wiki/xyz - it will be a valid wiki link - it will just not give an informative content. 
     



- Please let me know if you need any further extension to this programme in any other way -I can prrove you input accordingly.

  
      





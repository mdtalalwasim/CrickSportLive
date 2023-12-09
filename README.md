# CrickSportLive
<b>Realtime Cricket Score Update Application</b> on Spring Boot REST API <b>(Backend-Project)</b>. In this Spring Boot Backend project, We can check the <b>LIVE Score</b> for all the Running LIVE Matches, Can See the List of All Matches, and <b>Point Tables</b>. 

<br>
<b> Project Name:</b> Crick Sport Live. [Spring Boot REST API - Backend Project]<br>
<b>Status:</b> Complete ✅✅✅


# Technology Used in this Project:
  ✅ Frontend: <b>Decided Later</b><br> But till now HTML, CSS, JS used in FrontEnd. <br>
  ✅ Backend : <b>Spring Boot</b><br>
  ✅ Spring Data JPA  
  ✅ REST API<br>
  ✅ Scrapping

# Database:
  ✅ Database : MySQL



<h2>Backend API: </h2>

#### API: http://localhost:8080/api/match/live 
#### API Method : GET

OUTPUT: 
```bash
[
    {
        "matchId": 14,
        "teamHeading": "Bangladesh vs New Zealand,",
        "matchNumberVenue": "2nd Test Today  - Today  •  at Dhaka, Shere Bangla National Stadium",
        "battingTeam": "NZ",
        "battingTeamScore": "180 & 139-6",
        "bowlingTeam": "BAN",
        "bowlingTeamScore": "172 & 144",
        "liveText": "",
        "matchLink": "",
        "textComplete": "New Zealand won by 4 wkts",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.279+00:00"
    },
    {
        "matchId": 15,
        "teamHeading": "Adelaide Strikers vs Brisbane Heat,",
        "matchNumberVenue": "3rd Match Today  •  at Adelaide, Adelaide Oval",
        "battingTeam": "",
        "battingTeamScore": "",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Match abandoned without toss",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.378+00:00"
    },
    {
        "matchId": 16,
        "teamHeading": "Gujarat vs Bengal,",
        "matchNumberVenue": "1st Preliminary quarter final Today  •  at Rajkot, Saurashtra Cricket Association Stadium C",
        "battingTeam": "BEN",
        "battingTeamScore": "167-2 (30 Ovs)",
        "bowlingTeam": "GUJ",
        "bowlingTeamScore": "283-9 (50 Ovs)",
        "liveText": "Bengal need 117 runs",
        "matchLink": "/live-cricket-scores/75357/guj-vs-ben-1st-preliminary-quarter-final-vijay-hazare-trophy-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.391+00:00"
    },
    {
        "matchId": 17,
        "teamHeading": "Kerala vs Maharashtra,",
        "matchNumberVenue": "2nd Preliminary quarter final Today  •  at Rajkot, Saurashtra Cricket Association Stadium",
        "battingTeam": "MAH",
        "battingTeamScore": "105-0 (15 Ovs)",
        "bowlingTeam": "KER",
        "bowlingTeamScore": "383-4 (50 Ovs)",
        "liveText": "Maharashtra need 279 runs",
        "matchLink": "/live-cricket-scores/75364/ker-vs-mah-2nd-preliminary-quarter-final-vijay-hazare-trophy-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.403+00:00"
    },
    {
        "matchId": 18,
        "teamHeading": "Japan U19 vs Sri Lanka U19,",
        "matchNumberVenue": "Group B Today  •  at Dubai, ICC Academy Ground No 2",
        "battingTeam": "SLU1..",
        "battingTeamScore": "76-3 (12.2 Ovs)",
        "bowlingTeam": "JPNU..",
        "bowlingTeamScore": "75 (30.3 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Sri Lanka U19 won by 7 wkts",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.416+00:00"
    },
    {
        "matchId": 19,
        "teamHeading": "Bangladesh U19 vs United Arab Emirates U19,",
        "matchNumberVenue": "Group B Today  •  at Dubai, ICC Academy Ground",
        "battingTeam": "UAEU..",
        "battingTeamScore": "30-1 (7.5 Ovs)",
        "bowlingTeam": "BANU..",
        "bowlingTeamScore": "228 (49.3 Ovs)",
        "liveText": "United Arab Emirates U19 need 199 runs",
        "matchLink": "/live-cricket-scores/83214/banu19-vs-uaeu19-group-b-acc-u19-asia-cup-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.429+00:00"
    },
    {
        "matchId": 20,
        "teamHeading": "Mpumalanga Rhinos vs Knights,",
        "matchNumberVenue": "9th Match Today  - Today  •  at Mpumalanga, Uplands College, White River",
        "battingTeam": "KNG",
        "battingTeamScore": "74-0",
        "bowlingTeam": "MPR",
        "bowlingTeamScore": "267",
        "liveText": "Day 2: Stumps - Knights trail by 193 runs",
        "matchLink": "/live-cricket-scores/82511/mpr-vs-kng-9th-match-csa-four-day-series-division-two-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.445+00:00"
    },
    {
        "matchId": 21,
        "teamHeading": "Zimbabwe Women vs Kenya Women,",
        "matchNumberVenue": "1st Match Today  •  at Entebbe, Entebbe Cricket Oval",
        "battingTeam": "ZIMW",
        "battingTeamScore": "111-9 (20 Ovs)",
        "bowlingTeam": "KENW",
        "bowlingTeamScore": "49 (15.4 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Zimbabwe Women won by 62 runs",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.459+00:00"
    }
]

```
![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/c3ed5e40-8fe9-4a97-b9c2-0f5a92470efe)



#### API: http://localhost:8080/api/match/all-matches
 
#### API Method : GET

OUTPUT: 

```bash

[
    {
        "matchId": 1,
        "teamHeading": "South Africa vs Australia,",
        "matchNumberVenue": "2nd Semi-Final (2nd v 3rd) Today  •  at Kolkata, Eden Gardens",
        "battingTeam": "AUS",
        "battingTeamScore": "215-7 (47.2 Ovs)",
        "bowlingTeam": "RSA",
        "bowlingTeamScore": "212 (49.4 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Australia won by 3 wkts",
        "status": "COMPLETED",
        "date": "2023-11-16T19:03:14.529+00:00"
    },
    {
        "matchId": 2,
        "teamHeading": "Auckland vs Wellington,",
        "matchNumberVenue": "12th Match Today  - Today  •  at Auckland, Eden Park Outer Oval",
        "battingTeam": "WEL",
        "battingTeamScore": "343-9",
        "bowlingTeam": "AKL",
        "bowlingTeamScore": "500-8 d",
        "liveText": "Day 3: Stumps - Wellington trail by 157 runs",
        "matchLink": "/live-cricket-scores/79788/akl-vs-wel-12th-match-plunket-shield-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.763+00:00"
    },
    {
        "matchId": 3,
        "teamHeading": "Canterbury vs Central Districts,",
        "matchNumberVenue": "10th Match Today  - Today  •  at Napier, McLean Park",
        "battingTeam": "CD",
        "battingTeamScore": "177 & 157-4",
        "bowlingTeam": "CNTB..",
        "bowlingTeamScore": "225 & 320",
        "liveText": "Day 3: Stumps - Central Districts need 212 runs",
        "matchLink": "/live-cricket-scores/79774/cntbry-vs-cd-10th-match-plunket-shield-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.820+00:00"
    },
    {
        "matchId": 4,
        "teamHeading": "Northern Knights vs Otago,",
        "matchNumberVenue": "11th Match Today  - Today  •  at Dunedin, University Oval",
        "battingTeam": "NK",
        "battingTeamScore": "117 & 273-6",
        "bowlingTeam": "OTG",
        "bowlingTeamScore": "240-9 d",
        "liveText": "Day 3: Stumps - Northern Knights lead by 150 runs",
        "matchLink": "/live-cricket-scores/79781/nk-vs-otg-11th-match-plunket-shield-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.669+00:00"
    },
    {
        "matchId": 5,
        "teamHeading": "Lions vs North West,",
        "matchNumberVenue": "8th Match Today  - Today  •  at Johannesburg, The Wanderers Stadium",
        "battingTeam": "LION.. NWES..",
        "battingTeamScore": "504-5 d & 34-3 345 & 238 (f/o)",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Match drawn",
        "status": "COMPLETED",
        "date": "2023-11-17T08:51:38.775+00:00"
    },
    {
        "matchId": 6,
        "teamHeading": "South Australia vs Western Australia,",
        "matchNumberVenue": "13th Match Today  - Today  •  at Perth, W.A.C.A. Ground",
        "battingTeam": "WA",
        "battingTeamScore": "204 & 201-8",
        "bowlingTeam": "SAUS",
        "bowlingTeamScore": "192 & 212",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Western Australia won by 2 wkts",
        "status": "COMPLETED",
        "date": "2023-11-17T13:37:51.955+00:00"
    },
    {
        "matchId": 7,
        "teamHeading": "Victoria vs Queensland,",
        "matchNumberVenue": "14th Match Today  - Today  •  at Melbourne, Melbourne Cricket Ground",
        "battingTeam": "QL",
        "battingTeamScore": "106-5",
        "bowlingTeam": "VIC",
        "bowlingTeamScore": "300-7 d",
        "liveText": "Day 2: Stumps - Queensland trail by 194 runs",
        "matchLink": "/live-cricket-scores/79195/vic-vs-ql-14th-match-sheffield-shield-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.936+00:00"
    },
    {
        "matchId": 8,
        "teamHeading": "Mpumalanga Rhinos vs Border,",
        "matchNumberVenue": "6th Match Today  - Today  •  at East London, Buffalo Park",
        "battingTeam": "MPR",
        "battingTeamScore": "331-7",
        "bowlingTeam": "BOR",
        "bowlingTeamScore": "",
        "liveText": "Day 1: Stumps",
        "matchLink": "/live-cricket-scores/82497/mpr-vs-bor-6th-match-csa-four-day-series-division-two-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.972+00:00"
    },
    {
        "matchId": 9,
        "teamHeading": "Bangladesh U19 vs England U19,",
        "matchNumberVenue": "6th Match Today  •  at Vijayawada, Devineni Venkata Ramana Praneetha Ground, Mulapadu Bangladesh U19 opt to bowl ",
        "battingTeam": "",
        "battingTeamScore": "",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.913+00:00"
    },
    {
        "matchId": 10,
        "teamHeading": "India U19 A vs India U19 B,",
        "matchNumberVenue": "5th Match Today  •  at Vijayawada, Chukkapalli Pitchaiah Cricket Ground, Mulapadu India U19 A opt to bowl ",
        "battingTeam": "",
        "battingTeamScore": "",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T13:37:51.878+00:00"
    },
    {
        "matchId": 11,
        "teamHeading": "Melbourne Stars Women vs Hobart Hurricanes Women,",
        "matchNumberVenue": "42nd Match Today  •  at Brisbane, Allan Border Field",
        "battingTeam": "HBHW",
        "battingTeamScore": "122-2 (16.1 Ovs)",
        "bowlingTeam": "MLSW",
        "bowlingTeamScore": "121 (19.1 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Hobart Hurricanes Women won by 8 wkts",
        "status": "COMPLETED",
        "date": "2023-11-17T13:37:52.009+00:00"
    },
    {
        "matchId": 12,
        "teamHeading": "Brisbane Heat Women vs Melbourne Renegades Women,",
        "matchNumberVenue": "43rd Match Today  •  at Brisbane, Allan Border Field Brisbane Heat Women opt to bowl ",
        "battingTeam": "",
        "battingTeamScore": "",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-11-17T08:20:54.278+00:00"
    },
    {
        "matchId": 13,
        "teamHeading": "Melbourne Renegades Women vs Brisbane Heat Women,",
        "matchNumberVenue": "43rd Match Today  •  at Brisbane, Allan Border Field",
        "battingTeam": "MLRW",
        "battingTeamScore": "169-7 (20 Ovs)",
        "bowlingTeam": "BRHW",
        "bowlingTeamScore": "167-9 (20 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Melbourne Renegades Women won by 2 runs",
        "status": "COMPLETED",
        "date": "2023-11-17T13:37:51.991+00:00"
    },
    {
        "matchId": 14,
        "teamHeading": "Bangladesh vs New Zealand,",
        "matchNumberVenue": "2nd Test Today  - Today  •  at Dhaka, Shere Bangla National Stadium",
        "battingTeam": "NZ",
        "battingTeamScore": "180 & 139-6",
        "bowlingTeam": "BAN",
        "bowlingTeamScore": "172 & 144",
        "liveText": "",
        "matchLink": "",
        "textComplete": "New Zealand won by 4 wkts",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.279+00:00"
    },
    {
        "matchId": 15,
        "teamHeading": "Adelaide Strikers vs Brisbane Heat,",
        "matchNumberVenue": "3rd Match Today  •  at Adelaide, Adelaide Oval",
        "battingTeam": "",
        "battingTeamScore": "",
        "bowlingTeam": "",
        "bowlingTeamScore": "",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Match abandoned without toss",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.378+00:00"
    },
    {
        "matchId": 16,
        "teamHeading": "Gujarat vs Bengal,",
        "matchNumberVenue": "1st Preliminary quarter final Today  •  at Rajkot, Saurashtra Cricket Association Stadium C",
        "battingTeam": "BEN",
        "battingTeamScore": "167-2 (30 Ovs)",
        "bowlingTeam": "GUJ",
        "bowlingTeamScore": "283-9 (50 Ovs)",
        "liveText": "Bengal need 117 runs",
        "matchLink": "/live-cricket-scores/75357/guj-vs-ben-1st-preliminary-quarter-final-vijay-hazare-trophy-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.391+00:00"
    },
    {
        "matchId": 17,
        "teamHeading": "Kerala vs Maharashtra,",
        "matchNumberVenue": "2nd Preliminary quarter final Today  •  at Rajkot, Saurashtra Cricket Association Stadium",
        "battingTeam": "MAH",
        "battingTeamScore": "105-0 (15 Ovs)",
        "bowlingTeam": "KER",
        "bowlingTeamScore": "383-4 (50 Ovs)",
        "liveText": "Maharashtra need 279 runs",
        "matchLink": "/live-cricket-scores/75364/ker-vs-mah-2nd-preliminary-quarter-final-vijay-hazare-trophy-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.403+00:00"
    },
    {
        "matchId": 18,
        "teamHeading": "Japan U19 vs Sri Lanka U19,",
        "matchNumberVenue": "Group B Today  •  at Dubai, ICC Academy Ground No 2",
        "battingTeam": "SLU1..",
        "battingTeamScore": "76-3 (12.2 Ovs)",
        "bowlingTeam": "JPNU..",
        "bowlingTeamScore": "75 (30.3 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Sri Lanka U19 won by 7 wkts",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.416+00:00"
    },
    {
        "matchId": 19,
        "teamHeading": "Bangladesh U19 vs United Arab Emirates U19,",
        "matchNumberVenue": "Group B Today  •  at Dubai, ICC Academy Ground",
        "battingTeam": "UAEU..",
        "battingTeamScore": "30-1 (7.5 Ovs)",
        "bowlingTeam": "BANU..",
        "bowlingTeamScore": "228 (49.3 Ovs)",
        "liveText": "United Arab Emirates U19 need 199 runs",
        "matchLink": "/live-cricket-scores/83214/banu19-vs-uaeu19-group-b-acc-u19-asia-cup-2023",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.429+00:00"
    },
    {
        "matchId": 20,
        "teamHeading": "Mpumalanga Rhinos vs Knights,",
        "matchNumberVenue": "9th Match Today  - Today  •  at Mpumalanga, Uplands College, White River",
        "battingTeam": "KNG",
        "battingTeamScore": "74-0",
        "bowlingTeam": "MPR",
        "bowlingTeamScore": "267",
        "liveText": "Day 2: Stumps - Knights trail by 193 runs",
        "matchLink": "/live-cricket-scores/82511/mpr-vs-kng-9th-match-csa-four-day-series-division-two-2023-24",
        "textComplete": "",
        "status": "LIVE",
        "date": "2023-12-09T10:21:41.445+00:00"
    },
    {
        "matchId": 21,
        "teamHeading": "Zimbabwe Women vs Kenya Women,",
        "matchNumberVenue": "1st Match Today  •  at Entebbe, Entebbe Cricket Oval",
        "battingTeam": "ZIMW",
        "battingTeamScore": "111-9 (20 Ovs)",
        "bowlingTeam": "KENW",
        "bowlingTeamScore": "49 (15.4 Ovs)",
        "liveText": "",
        "matchLink": "",
        "textComplete": "Zimbabwe Women won by 62 runs",
        "status": "COMPLETED",
        "date": "2023-12-09T10:21:41.459+00:00"
    }
]

```
![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/c8e53d92-1714-467b-b19f-b9bc1576abb3)
![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/0e5fea02-0945-44f3-81c3-f3b30d3fe771)



#### API: http://localhost:8080/api/match/point-table
 
#### API Method : GET

OUTPUT: 

![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/2bbeba43-eacc-423b-9ea9-9cfc35b905b3)
![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/7dd18a20-cf9b-4f9a-835e-2bbcd2a7375e)
![image](https://github.com/mdtalalwasim/CrickSportLive/assets/91146041/299c33f2-7759-494d-9d3a-daabccbb99cc)






  
  

@startuml
' ----- Classes principales -----
class UserTable {
    -id: int
    -name: String
    -password: String
    -role: string
    +Connect(): void
}

class Project {
    -id: int
    -title: string
    -shortDescription: string
    -completeDescription: string
    -linkGithub: string
    -linkDemo: string
    -linkOther: string
    -videoUrl: string
    -createdAt: datetime
    -isOnline: boolean
    -order: int
    +create()
    +update()
    +toggleOnline()
    +changeOrder()
}

class Images {
    -id: int
    -projectId: int <<FK>>
    -url: string
    -altText: string
    -order: int
    -dateUpload: datetime
    +upload()
    +delete()
    +changeOrder()
}

class Techno {
    -id: int
    -name: string
    -icon: string
    -category: string
}

class ProjectTechno {
    -projectId: int <<FK>>
    -technoId: int <<FK>>
    +add()
    +remove()
}

class Informations {
    -id: int = 1
    -fullName: string
    -jobTitle: string
    -introTagline: string
    -introText: text
    -profilePhotoUrl: string

    -aboutTitle: string
    -aboutDescription: text
    -aboutPhotoUrl: string
    -aboutVideoUrl: string
    -email: string
    
    
    
    -cvUrl: string
    -lastModified: datetime

    +modify()
}



class SocialNetwork {
    -id: int
    -name: string
    -url: string
    -icon: string
    -order: int
  
}






' ----- Relations -----
Project "1" --> "*" Images
Project "0..*" --> "0..*" ProjectTechno
Techno "0..*" --> "0..*" ProjectTechno
Informations "1" --> "*" Techno
Informations "1" --> "*" SocialNetwork
@enduml

-- ============================
-- INSERT TECHNOLOGIES
-- ============================
INSERT INTO techno ( name, icon, category) VALUES
( 'Java', '/icons/java.svg', 'Backend'),
( 'Spring Boot', '/icons/spring.svg', 'Backend'),
( 'JavaScript', '/icons/javascript.svg', 'Frontend'),
( 'React', '/icons/react.svg', 'Frontend'),
( 'MySQL', '/icons/mysql.svg', 'Database'),
( 'Docker', '/icons/docker.svg', 'DevOps');


-- ============================
-- INSERT PROJECTS
-- ============================
INSERT INTO project (
     title, short_description, complete_description,
    link_github, link_demo, link_other, video_url,
    created_at, is_online, sort_order
) VALUES
(
 'Portfolio Website',
 'Un portfolio moderne pour présenter mes projets.',
 'Site complet comprenant une interface admin, page de présentation, projets dynamiques, API REST en Java Spring Boot.',
 'https://github.com/me/portfolio',
 'https://me-portfolio-demo.com',
 NULL,
 NULL,
 NOW(),
 TRUE,
 1
),
(
 'API REST E-Commerce',
 'Une API REST complète pour gérer un site e-commerce.',
 'Gestion des produits, commandes, utilisateurs, paniers. Sécurité JWT. Documentation Swagger.',
 'https://github.com/me/ecommerce-api',
 NULL,
 NULL,
 NULL,
 NOW(),
 TRUE,
 2
),
(
 'Clone Netflix',
 'Un clone Netflix en React.',
 'Streaming simulé, gestion des utilisateurs, bandeaux dynamiques et design responsive.',
 'https://github.com/me/netflix-clone',
 'https://demo-netflix-clone.com',
 NULL,
 NULL,
 NOW(),
 FALSE,
 3
);


-- ============================
-- INSERT IMAGES (6 images par projet)
-- ============================
INSERT INTO image ( url, title, sort_order, uploaded_at, project_id) VALUES
-- Project 1 (Portfolio Website)
( '/uploads/no-image.jpg', 'Image 1', 1, NOW(), 1),
( '/uploads/no-image.jpg', 'Image 2', 2, NOW(), 1),
( '/uploads/no-image.jpg', 'Image 3', 3, NOW(), 1),
( '/uploads/no-image.jpg', 'Image 4', 4, NOW(), 1),
( '/uploads/no-image.jpg', 'Image 5', 5, NOW(), 1),
( '/uploads/no-image.jpg', 'Image 6', 6, NOW(), 1),

-- Project 2 (E-Commerce API)
( '/uploads/no-image.jpg', 'Image 1', 1, NOW(), 2),
( '/uploads/no-image.jpg', 'Image 2', 2, NOW(), 2),
( '/uploads/no-image.jpg', 'Image 3', 3, NOW(), 2),
( '/uploads/no-image.jpg', 'Image 4', 4, NOW(), 2),
( '/uploads/no-image.jpg', 'Image 5', 5, NOW(), 2),
( '/uploads/no-image.jpg', 'Image 6', 6, NOW(), 2),

-- Project 3 (Netflix Clone)
( '/uploads/no-image.jpg', 'Image 1', 1, NOW(), 3),
( '/uploads/no-image.jpg', 'Image 2', 2, NOW(), 3),
( '/uploads/no-image.jpg', 'Image 3', 3, NOW(), 3),
( '/uploads/no-image.jpg', 'Image 4', 4, NOW(), 3),
( '/uploads/no-image.jpg', 'Image 5', 5, NOW(), 3),
( '/uploads/no-image.jpg', 'Image 6', 6, NOW(), 3);


-- ============================
-- INSERT PROJECT TECHNO (table pivot)
-- ============================
INSERT INTO project_techno (project_id, techno_id) VALUES
-- Portfolio Website
(1, 1),
(1, 2),
(1, 3),
(1, 4),

-- E-Commerce API
(2, 1),
(2, 2),
(2, 5),
(2, 6),

-- Netflix Clone
(3, 3),
(3, 4);

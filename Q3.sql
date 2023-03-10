select owner_id, owner_name, COUNT(category_id)
FROM owner
Left Join article on owner_id = article_id
Inner Join category_article_mapping on article_id = category_id
GROUP BY
owner_id,
owner_name
ORDER BY 
COUNT(category_id) DESC;
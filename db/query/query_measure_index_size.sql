select pg_size_pretty(pg_relation_size('index_ticket_event_id')) as index_ticket_event_id,
 pg_size_pretty(pg_relation_size('index_ticket_user_id')) as index_ticket_user_id,
 pg_size_pretty(pg_relation_size('index_ticket_category')) as index_ticket_category,
 pg_size_pretty(pg_relation_size('index_event_date')) as index_event_date,
 pg_size_pretty(pg_relation_size('index_event_title')) as index_event_title,
 pg_size_pretty(pg_relation_size('index_user_email')) as index_user_email,
 pg_size_pretty(pg_relation_size('index_user_name')) as index_user_name
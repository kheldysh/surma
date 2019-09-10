CREATE SCHEMA IF NOT EXISTS surma;

CREATE TABLE IF NOT EXISTS tournament (
  id         SERIAL UNIQUE PRIMARY KEY,
  name       TEXT,
  start_date TIMESTAMP WITH TIME ZONE,
  end_date   TIMESTAMP WITH TIME ZONE
);

CREATE TABLE IF NOT EXISTS player (
  id            SERIAL UNIQUE PRIMARY KEY,
  tournament_id INTEGER,
  alias         TEXT,
  description   JSONB,
  calendar      JSONB,
  FOREIGN KEY (tournament_id) REFERENCES tournament (id)
);

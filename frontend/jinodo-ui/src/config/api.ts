const defaultUrl = import.meta.env.DEV
  ? 'http://localhost:8080'
  : 'https://api.tongmilz.com';

const unifiedUrl = (import.meta.env.VITE_JINODO_URL || defaultUrl).replace(/\/+$/, '');

export const AUTH_BASE_URL = unifiedUrl;
export const INGESTION_BASE_URL = unifiedUrl;
export const PROCESSING_BASE_URL = unifiedUrl;
export const CHAT_BASE_URL = unifiedUrl;

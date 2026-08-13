/**
 * Shared building blocks used across every module: common exception
 * types, the standard error-response shape, and cross-cutting config
 * (CORS, JSON serialization) that doesn't belong to one feature.
 *
 * <p>Kept deliberately small -- if something is only used by one
 * module, it belongs in that module's package, not here.
 */
package com.campusmentor.backend.common;

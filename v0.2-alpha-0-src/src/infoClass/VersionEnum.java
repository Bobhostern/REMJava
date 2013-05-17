/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infoClass;

/**
 * These are the enums for versioning and what they represent.
 * @author onigiri
 */
public enum VersionEnum {
    /**
     * ALPHA - barely different from the previous release. 
     * Use the most recent previous release unless you need something that was introduced in this release.
     */
    ALPHA,
    /**
     * BETA - quite different, but not there yet, or this current release is buggy.
     * Use at your own discretion.
     */
    BETA,
    /**
     * GAMMA - the final release for a version.
     * Use this if in doubt.
     */
    GAMMA
}

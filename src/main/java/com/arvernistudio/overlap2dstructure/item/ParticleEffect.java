package com.arvernistudio.overlap2dstructure.item;

/**
 * Particle effect is usually rendered based on the name it has
 * that is attached to particle configuration file provided in exported assets.
 * It knows things about it’s emmiters and textures.
 * But in terms of data structure it’s very simple
 * @author nprugne
 */
public class ParticleEffect extends Item {

    /**
     * Default constructor
     */
    public ParticleEffect() {
    }

    /**
     * Name of configuration file, that is in libGDX particle effect format
     */
    public String particleName;

}
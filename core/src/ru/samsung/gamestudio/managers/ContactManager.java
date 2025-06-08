package ru.samsung.gamestudio.managers;

import com.badlogic.gdx.physics.box2d.*;
import ru.samsung.gamestudio.GameSettings;
import ru.samsung.gamestudio.objects.GameObject;

public class ContactManager {

    World world;

    public ContactManager(World world) {
        this.world = world;

        world.setContactListener(new ContactListener() {
            @Override
            public void beginContact(Contact contact) {

                Fixture fixA = contact.getFixtureA();
                Fixture fixB = contact.getFixtureB();

                int cDef = fixA.getFilterData().categoryBits;
                int cDef2 = fixB.getFilterData().categoryBits;

                if (cDef == GameSettings.ZOMBIE_BIT && cDef2 == GameSettings.BULLET_BIT
                        || cDef2 == GameSettings.ZOMBIE_BIT && cDef == GameSettings.BULLET_BIT
                        || cDef == GameSettings.ZOMBIE_BIT && cDef2 == GameSettings.SHOOTER_BIT
                        || cDef2 == GameSettings.ZOMBIE_BIT && cDef == GameSettings.SHOOTER_BIT) {

                    ((GameObject) fixA.getUserData()).hit();
                    ((GameObject) fixB.getUserData()).hit();

                }
            }

            @Override
            public void endContact(Contact contact) {
            }

            @Override
            public void preSolve(Contact contact, Manifold oldManifold) {
            }

            @Override
            public void postSolve(Contact contact, ContactImpulse impulse) {
            }
        });

    }

}

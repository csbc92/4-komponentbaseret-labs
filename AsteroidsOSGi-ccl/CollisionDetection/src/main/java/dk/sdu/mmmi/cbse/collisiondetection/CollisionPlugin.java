/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.collisiondetection;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author ccl
 */
@ServiceProvider(service = IGamePluginService.class)
public class CollisionPlugin implements IGamePluginService {

    public CollisionPlugin() {
        System.out.println("CollisionPlugin IGamePluginService ctor ..");
    }
    
    @Override
    public void start(GameData gameData, World world) {
        
    }

    @Override
    public void stop(GameData gameData, World world) {
        
    }
    
}

package com.ahmad.CodersToolBackEnd.Controllers.Communication;

import com.ahmad.CodersToolBackEnd.dto.Communication.HandshakeResponse;
import com.ahmad.CodersToolBackEnd.dto.Communication.HeartBeatResponse;
import com.ahmad.CodersToolBackEnd.payLoad.Communication.HandshakeRequestPayLoad;
import com.ahmad.CodersToolBackEnd.payLoad.Communication.HeartBeatRequestPayLoad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/server")
public class ServerSyncController {
    @GetMapping
    public ResponseEntity<String> getServerInformation(){
        return ResponseEntity.ok("Server is up and running");
    }

    @PostMapping("/handshake")
    public ResponseEntity<HandshakeResponse> checkForHandshake(@RequestBody HandshakeRequestPayLoad request){
        HandshakeResponse response = new HandshakeResponse(true, "Handshake is accepted");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/heatBeat")
    public ResponseEntity<HeartBeatResponse> checkHeartBeat(@RequestBody HeartBeatRequestPayLoad request){
        HeartBeatResponse response = new HeartBeatResponse("alive");
        return ResponseEntity.ok(response);
    }
}

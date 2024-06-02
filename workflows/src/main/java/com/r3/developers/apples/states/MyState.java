package com.r3.developers.apples.states;

import net.corda.v5.ledger.utxo.ContractState;
import org.jetbrains.annotations.NotNull;
import com.r3.corda.ledger.utxo.ownable;

import java.security.PublicKey;
import java.util.List;

public class MyState implements ContractState, OwnableState {

    private final String value;
    private final Party owner;
    @NotNull
    @Override
    public List<PublicKey> getParticipants() {
        return null;
    }
}

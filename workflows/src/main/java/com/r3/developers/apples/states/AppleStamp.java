package com.r3.developers.apples.states;

import com.r3.developers.apples.contracts.AppleStampContract;
import net.corda.v5.ledger.utxo.BelongsToContract;
import net.corda.v5.ledger.utxo.ContractState;
import org.jetbrains.annotations.NotNull;

import java.security.PublicKey;
import java.util.List;

@BelongsToContract(AppleStampContract.class)
public class AppleStamp implements ContractState {

    private List<PublicKey> participants;
    @NotNull
    @Override
    public List<PublicKey> getParticipants() {
        return participants;
    }
}

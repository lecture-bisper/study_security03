package com.bitc.security03.repository;

import com.bitc.security03.entity.ClubMember;
import com.bitc.security03.entity.ClubMemberRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubMemberRepository extends JpaRepository<ClubMember, String> {
}

package com.dongnering.mail.scheduler;

import com.dongnering.mail.application.MailService;
import com.dongnering.mypage.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NewsScheduler {

    private final MailService mailService;
    private final MemberRepository memberRepository;

    // TODO: 뉴스 연결

    // 매일 오전 7시에 메일 전송 실행
    @Scheduled(cron = "0 15 1 * * *")
    public void sendDailyNews() {
        memberRepository.findAll().forEach(member -> {
            try {
                mailService.sendDailyNews(member.getEmail(), "양천구"
                        , "지금 확인해야 하는 신입 채용 정보\n" +
                                "지금 가장 핫한 기업 채용공고와 오늘 올라온 채용공고 확인하고, 합격률 올리세요!\n" +
                                "신입·인턴 | 자료실 | 이력서 관리\n" +
                                "지금 hot한 일반사무 신입 공고 TOP5\n" +
                                "유진투자증권D-17\n" +
                                "[유진투자증권] 해외주식팀(야간데스크) 신입/경력직원 채용\n" +
                                "우측 화살표\n" +
                                "한국철도공사D-12\n" +
                                "2025년 하반기 한국철도공사 신입사원(채용형인턴) 채용 공고(~8.26. 14:00)\n" +
                                "우측 화살표\n" +
                                "서영엔지니어링D-8\n" +
                                "상하수도부 행정처리(편집자) 경력 및 신입사원 모집\n" +
                                "우측 화살표\n" +
                                "주식회사 현대홈쇼핑D-6\n" +
                                "현대홈쇼핑 전문직 채용 (정산/서무)\n" +
                                "우측 화살표\n" +
                                "글로벌오픈파트너스D-60\n" +
                                "과학/산업 분야 신입 연구원 및 인턴 모집\n" +
                                "우측 화살표\n" +
                                "배너 이미지 설명 입력\n" +
                                "지금 핫한공고 모음! BEST5\n" +
                                "컴투스D-43\n" +
                                "(플랫폼) AI 서비스를 위한 서버 엔지니어 (4년 이상)\n" +
                                "우측 화살표\n" +
                                "디비엠앤에스D-30\n" +
                                "[을지로] 교육비/정착비 350만 지급 - 신입 및 경력 상담원 모집.\n" +
                                "우측 화살표\n" +
                                "스노우D-7\n" +
                                "[SNOW] 브라질 타겟 EPIK 콘텐츠 마케팅 체험형 인턴\n" +
                                "우측 화살표\n" +
                                "케이티텔레캅주식회사D-46\n" +
                                "[kt telecop] 2025년 B2C영업 분야 상시채용\n" +
                                "우측 화살표\n" +
                                "동국제강D-17\n" +
                                "[동국제강 당진공장] 생산직(기술직/지원직) 채용\n" +
                                "우측 화살표\n" +
                                "배너 이미지 설명 입력\n" +
                                "알짜배기 기업에서 커리어를 시작해보세요!\n" +
                                "재단법인 한국우편사업진흥원D-14\n" +
                                "한국우편사업진흥원 신규직원 채용공고\n" +
                                "우측 화살표\n" +
                                "한국법무보호복지공단D-6\n" +
                                "신입직원(취업지원직, 심리상담직, 직업훈련교사직(자동차정비·용접) 경력경쟁채용시험\n" +
                                "우측 화살표\n" +
                                "재단법인 한국우편사업진흥원D-14\n" +
                                "한국우편사업진흥원 신규직원 채용공고(일반직,기술직,전문직(특수))\n" +
                                "우측 화살표\n" +
                                "알티엠파트너스D-30\n" +
                                "[미국 이민 법인] SNS 콘텐츠 마케터 (디자인 가능한 분)\n" +
                                "우측 화살표\n" +
                                "아이이에이D-30\n" +
                                "대기업 글로벌 서비스 테스트 QA 테스터 모집"
                        , "https");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

import ResponseDto from "src/apis/response.dto";        // 중괄호가 없는건 기본값을 내보냄

// description 로그인 Response Body DTO 
export interface SignInResponseDto extends ResponseDto {
    accessToken: string;
    expires: number;
}
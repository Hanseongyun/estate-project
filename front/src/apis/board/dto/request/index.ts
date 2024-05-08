// description: Q&A 작성 Request Body DTO //
export interface PostBoardRequestDto {
    title: string;
    contents: string;
}

export interface PostCommentRequestDto {
    comment: string;
}

export interface PutBoardReauestDto {
    title: string;
    contents: string;
    
}